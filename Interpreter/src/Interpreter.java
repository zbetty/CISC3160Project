// CISC 3160 Project

import java.util.*;
import java.util.regex.*;

public class Interpreter {
    private class Info {
        public Pattern pattern;
        public int token;

        public Info(Pattern pattern, int token) {
            this.pattern = pattern;
            this.token = token;
        }
    }

    // To hold all tokens
    private  LinkedList<Info> tokens;

    public Interpreter() {
        tokens = new LinkedList<>();
    }

    // Checks the input
    public void interpreter(String str) {

    }
}
