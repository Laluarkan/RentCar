
package model;

public class model_login {
   private String id_karyawan;
   private String username;
   private String password;

    public String getId_pengguna() {
        return id_karyawan;
    }

    public void setId_pengguna(String id_karyawan) {
        this.id_karyawan = id_karyawan;
    }

    public String getUsername() {
        return username;
    } 

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
