public class ToCsv implements Format{
    @Override
    public <T extends Task> String createString(T task) {
        return String.format("%d. %s. Дата и время добавления: %s %s. Дедлайн: %s. Автор: %s. Приоритет: %s\n",
                task.getId(), task.getTask(), task.getRecDate(), task.getRecTime(), task.getDeadline(),
                task.getAuthor(), task.getPriority());
    }
}
