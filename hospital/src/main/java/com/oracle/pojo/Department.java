package com.oracle.pojo;
/*+------------------------+--------------+------+-----+---------+----------------+
        | Field                  | Type         | Null | Key | Default | Extra          |
        +------------------------+--------------+------+-----+---------+----------------+
        | department_id          | int(11)      | NO   | PRI | NULL    | auto_increment |
        | department_name        | varchar(255) | YES  |     | NULL    |                |
        | department_pid         | int(11)      | YES  | MUL | NULL    |                |
        | department_level       | int(11)      | YES  |     | NULL    |                |
        | department_description | varchar(500) | YES  |     | NULL    |                |
        +------------------------+--------------+------+-----+---------+----------------+*/
public class Department implements java.io.Serializable {
  private Integer department_Id;
  private String department_name;
  private Integer department_pid;
  private Integer department_level;
  private String department_description;







    public Department(Integer department_Id, String department_name, Integer department_pid, Integer department_level, String department_description) {
        this.department_Id = department_Id;
        this.department_name = department_name;
        this.department_pid = department_pid;
        this.department_level = department_level;
        this.department_description = department_description;
    }
    public Department() {
    }

    public Integer getDepartment_Id() {
        return department_Id;
    }

    public void setDepartment_Id(Integer department_Id) {
        this.department_Id = department_Id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public Integer getDepartment_pid() {
        return department_pid;
    }

    public void setDepartment_pid(Integer department_pid) {
        this.department_pid = department_pid;
    }

    public Integer getDepartment_level() {
        return department_level;
    }

    public void setDepartment_level(Integer department_level) {
        this.department_level = department_level;
    }

    public String getDepartment_description() {
        return department_description;
    }

    public void setDepartment_description(String department_description) {
        this.department_description = department_description;
    }

    @Override
    public String toString() {
        return "Department{" +
                "department_Id=" + department_Id +
                ", department_name='" + department_name + '\'' +
                ", department_pid='" + department_pid + '\'' +
                ", department_level='" + department_level + '\'' +
                ", department_description='" + department_description + '\'' +
                '}';
    }

}
