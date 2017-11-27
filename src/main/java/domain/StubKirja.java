package domain;

public class StubKirja implements Lukuvinkki {

    public String toString() {
        String s = "minä olen testiolio " +"\n" +
                "Lorem ipsum dolor sit amet, jne jne jne.";
        return s;
    }

    @Override
    public void setLuettu(boolean luettu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isLuettu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
