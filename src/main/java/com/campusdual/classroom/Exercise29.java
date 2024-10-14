package com.campusdual.classroom;

public class Exercise29 {
    public static void main(String[] args){

        try {

            provocarError("Mensaje de error");

        } catch (Exception e) {

            System.out.print(e.getMessage());

        }



    }

    private static void  provocarError(String message) throws Exception{

        throw new Exception(message);

    }
}
