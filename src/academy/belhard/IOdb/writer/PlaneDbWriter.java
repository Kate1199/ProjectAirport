package academy.belhard.IOdb.writer;

import academy.belhard.Connector;
import academy.belhard.entity.Pilot;
import academy.belhard.entity.Plane;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PlaneDbWriter {

    public static final String INSERT = "INSERT INTO planes (id, mark, model, passengers, tail_number) " +
            "VALUES(?, ?, ?, ?, ?)";

    public static void insert(List<Plane> planes) {

        Connection connection = Connector.getConnection();
        System.out.println("Старт записи в таблицу \"Самолёты\"");
        for(Plane plane : planes) {
            try(PreparedStatement statement = connection.prepareStatement(INSERT)) {
                statement.setInt(1, plane.getId());
                statement.setString(2, plane.getMark());
                statement.setString(3, plane.getModel());
                statement.setInt(4, plane.getPassengers());
                statement.setString(5, plane.getTailNumber());

                statement.executeUpdate();
                System.out.println("Записан самолет с бортовым номером " + plane.getTailNumber() + ", id = " + plane.getId());
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Запись в таблицу \"Самолёты\" завершена");
    }
}
