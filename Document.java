public class Document {
    private String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String fix(String string){
        string = string.trim();
        string = string.replaceAll("( )+", " ");
        return string;
    }
}
