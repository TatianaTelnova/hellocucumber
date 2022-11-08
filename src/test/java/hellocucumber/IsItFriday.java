package hellocucumber;

class IsItFriday {
    static String isItFriday(String today) {
        if ("Friday".equals(today)) {
            return "TGIF";
        } else {
            return "Nope";
        }
    }
}