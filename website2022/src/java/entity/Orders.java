
package entity;

public class Orders {
  
    private int ido;
    private String user;
    private String date;
    private double money;

    public Orders() {
    }

    public Orders(int ido, String user, String date, double money) {
        this.ido = ido;
        this.user = user;
        this.date = date;
        this.money = money;
    }

    public int getIdo() {
        return ido;
    }

    public void setIdo(int ido) {
        this.ido = ido;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Orders{" + "ido=" + ido + ", user=" + user + ", date=" + date + ", money=" + money + '}';
    }
    
    
    
}
