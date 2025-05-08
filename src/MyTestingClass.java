public class MyTestingClass {
    private String name;

    public MyTestingClass(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyTestingClass that = (MyTestingClass) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        for (char c : name.toCharArray()) {
            hash = 31 * hash + c;
        }
        return Math.abs(hash);
    }
}