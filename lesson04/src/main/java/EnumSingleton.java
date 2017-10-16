public enum EnumSingleton {
    INSTANCE;
    private Person instance;
    EnumSingleton() {
        instance = new Person();
    }
    public Person getInstance() {
        return instance;
    }
}