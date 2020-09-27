public enum LogType {
    КОНСОЛЬ("КОНСОЛЬ (Вывод в консоль)"),
    ФАЙЛ("ФАЙЛ (Запись в файл)"),
    БД("БД (Запись в БД)");

    private final String description;

    LogType(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
