package kg.megacom.models;

import kg.megacom.enums.ClientStatus;

public class Client implements Comparable<Client>{
    private int id;

    private Department department;
    private ClientStatus status;

    public Client(int id, Department department,ClientStatus status) {
        this.id = id;

        this.department = department;
        this.status = status;
    }

    public ClientStatus getStatus() {
        return status;
    }

    public void setStatus(ClientStatus status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id + " - " + department + " - " + status + " - ";
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public int compareTo(Client o) {
        if (status == (o.getStatus())) {
            if (id == o.getId()) {
                return 1;
            } else {
                return -1;
            }
        } else {
            if (status.equals(ClientStatus.CLASSIC)) {
                return -1;
            } else {
                return 1;
            }
        }

    }

}
