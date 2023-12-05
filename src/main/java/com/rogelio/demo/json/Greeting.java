package com.rogelio.demo.json;

//Immutable data holders with autogenerated string equals and hash code methods
//primary constructor appears before the {}
public record Greeting(String message){}
//Using records we can skip all this boiler plate code
    /*import java.util.Objects;

    public class Greeting {
        private String message;

        public Greeting() {}

        public Greeting(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Greeting)) return false;
            Greeting gr = (Greeting) o;
            return Objects.equals(message, gr.message);
        }

        @Override
        public int hashCode() {
            return Objects.hash(message);
        }

        @Override
        public String toString() {
            return message;
        }
    }*/