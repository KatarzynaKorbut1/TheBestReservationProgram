package models;

public class AirPort {

            String miejscewylotu ;
            String miejsceprzylotu;

    public AirPort(String miejscewylotu) {
        this.miejscewylotu = miejscewylotu;
    }

    public void setMiejsceprzylotu(String miejsceprzylotu) {
        this.miejsceprzylotu = miejsceprzylotu;
    }

    public void setMiejscewylotu(String miejscewylotu) {
        this.miejscewylotu = miejscewylotu;
    }

    public String getMiejsceprzylotu() {
        return miejsceprzylotu;
    }

    public String getMiejscewylotu() {
        return miejscewylotu;
    }
}
