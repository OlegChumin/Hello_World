package materials.lesson_07_08.VI_comments;

/**
 * Класс для представления точки в двумерном пространстве.
 */
public class Point {

    // Это однострочный комментарий
    private int x;

    /* Это многострочный комментарий,
   который может занимать
   несколько строк. */
    private int y;

    /**
     * Конструктор для создания точки.
     *
     * @param x Горизонтальная координата точки.
     * @param y Вертикальная координата точки.
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Возвращает горизонтальную координату точки.
     *
     * @return Горизонтальная координата.
     */
    public int getX() {
        return x;
    }

    /**
     * Устанавливает горизонтальную координату точки.
     *
     * @param x Новая горизонтальная координата.
     */
    public void setX(int x) {
        this.x = x;
    }

    // ... Другие методы ...
}
