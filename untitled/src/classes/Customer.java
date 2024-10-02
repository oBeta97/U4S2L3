package classes;

public class Customer {
    private final long id;
    private String name;
    private int tier;

    public Customer(String name, int tier) {
        this.id = hashCode();
        setName(name);
        setTier(tier);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTier() {
        return tier;
    }
}
