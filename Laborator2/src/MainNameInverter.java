public class MainNameInverter {

    public static void main(String[] args) {

    }

    public static String NameInverter (String text){
        if(text == null)
            return null;

        if(!text.contains(" "))
            return text;

        String[] names = text.split(" ");


        switch (names.length){
            case 1: return names[0];
            case 2: return names[1] + ", " + names[0];
            case 3: return names[2] + ", " + names[1] + " " + names[0];
            case 4: return names[3] + ", " + names[2] + " " + names[0] + " " + names[1];
            default: return null;
        }

    }
}
