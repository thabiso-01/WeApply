package dao;

import util.DBConnection;
import model.Institution;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InstitutionDAO {

    public List<Institution> getAllInstitutions(){

        List<Institution> list = new ArrayList<>();

        try{
            Connection con = DBConnection.getConnection();
            String sql = "SELECT * FROM institutions";

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                Institution i = new Institution();

                i.setId(rs.getInt("id"));
                i.setName(rs.getString("name"));
                i.setType(rs.getString("type"));
                i.setProvince(rs.getString("province"));
                i.setWebsite(rs.getString("website"));

                list.add(i);
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        return list;
    }
}