package contacts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by LHW on 2018/2/3.
 */
@Repository
public class ContactRepository {
    private JdbcTemplate jdbc;
    @Autowired
    public ContactRepository(JdbcTemplate jdbc){
        this.jdbc=jdbc;
    }

    public List<Contact> findAll(){
        return jdbc.query("select id ,firstName,lastName,phoneNumber,emailAddress "+
        "from contacts order by lastname",new RowMapper<Contact>(){
            @Override
            public Contact mapRow(ResultSet resultSet, int rowNum) throws SQLException {
               Contact contact=new Contact();
               contact.setId(resultSet.getLong(1));
               contact.setFirstName(resultSet.getString(2));
               contact.setLastName(resultSet.getString(3));
               contact.setPhoneNumber(resultSet.getString(4));
               contact.setEmailAddress(resultSet.getString(5));
                return  contact;
            }
        });
    }

    public void save(Contact contact){
        jdbc.update("insert into contacts (firstName,lastName,phoneNumber,emailAddress)"+
        " values (?,?,?,?)",contact.getFirstName(),contact.getLastName(),
                contact.getPhoneNumber(),contact.getEmailAddress());


    }
}
