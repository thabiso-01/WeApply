package model;

public class Institution {

    private int id;
    private String name;
    private String type;
    private String province;
    private String website;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getProvince() { return province; }
    public void setProvince(String province) { this.province = province; }

    public String getWebsite() { return website; }
    public void setWebsite(String website) { this.website = website; }
}