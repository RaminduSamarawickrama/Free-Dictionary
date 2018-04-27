/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dictionaryapplication.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import lk.ijse.dictionaryapplication.db.DBConnection;
import lk.ijse.dictionaryapplication.model.Word;

/**
 *
 * @author nethm
 */
public class WordController {

    public static int addWord(Word word) throws Exception {
        String sql = "insert into table entries ('" + word.getWord() + "','" + word.getWord_type() + "','" + word.getWord_definition() + "')";
        Connection connection = DBConnection.getDBConnection().getConnection();
        Statement s = connection.createStatement();
        return s.executeUpdate(sql);

    }

    public static Word getDefinition(String word) throws SQLException, ClassNotFoundException {
        System.out.println(word);
        String sql = "Select * From entries where word='" + word + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        Word word1 = null;
        if (rst.next()) {
            word1 = new Word(rst.getString(1), rst.getString(2), rst.getString(3));
        }
        return word1;
    }
}
