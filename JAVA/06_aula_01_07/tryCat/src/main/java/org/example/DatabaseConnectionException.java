package org.example;


import java.sql.*;

public class DatabaseConnectionException extends Exception {


            public DatabaseConnectionException(String message, Throwable cause) {
                super(message, cause);
            }


            public class DatabaseManager {

                private static final String URL = "jdbc:postgresql://localhost:5432/seu_banco_de_dados";
                private static final String USER = "seu_usuario";
                private static final String PASSWORD = "sua_senha";

                public Connection connect() throws DatabaseConnectionException {
                    try {
                        return DriverManager.getConnection(URL, USER, PASSWORD);
                    } catch (SQLException e) {
                        throw new DatabaseConnectionException("Falha na conexão com o banco de dados", e);
                    }
                }

                public ResultSet executeQuery(String query) throws SQLQueryException, DatabaseConnectionException {
                    try (Connection connection = connect(); Statement statement = connection.createStatement()) {
                        return statement.executeQuery(query);
                    } catch (SQLException e) {
                        throw new SQLQueryException("Falha na execução da consulta SQL", e);
                    }
                }

                public void main(String[] args) {
                    DatabaseManager dbManager = new DatabaseManager();
                    try {
                        ResultSet rs = dbManager.executeQuery("SELECT * FROM sua_tabela");
                        while (rs.next()) {
                            System.out.println("ID: " + rs.getInt("id") + ", Nome: " + rs.getString("nome"));
                        }
                    } catch (DatabaseConnectionException | SQLQueryException e) {
                        e.printStackTrace();
                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

        }


