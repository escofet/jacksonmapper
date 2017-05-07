package com.itformacion.helloworld;
/*
    Simple Maven Jackson Project
*/
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class HelloWorld {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        User user = new User("Eduardo","123");

        //Object to JSON in file
        //mapper.writeValue(new File("user.json"), user);

        //Object to JSON in String
        System.out.println(mapper
            .writerWithDefaultPrettyPrinter()
            .writeValueAsString(user)
        );
    }

    @SuppressWarnings("unused")
    private static class User {
        private String name;
        private String pass;
        
        public User(String name, String pass) {
            this.name = name;
            this.pass = pass;
        }

		public String getPass() {
            return pass;
        }

        public void setPass(String pass) {
            this.pass = pass;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}