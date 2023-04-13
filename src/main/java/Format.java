//интерфейс создания строк для разных форматов файла
public interface Format {
    <T extends Task> String createString(T task);
}
