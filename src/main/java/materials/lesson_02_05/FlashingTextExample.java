package materials.lesson_02_05;

/**
 * В этом примере текст "Мигающий текст" будет мигать в консоли. Thread.sleep(500) вызывает паузу в 500 миллисекунд
 * (полсекунды). Здесь это используется для создания эффекта мигания. Обратите внимание, что \r используется для
 * возврата каретки, чтобы перезаписать текст в той же строке.
 *
 * Вы можете изменить длительность паузы или количество итераций в цикле в зависимости от ваших предпочтений.
 * */

public class FlashingTextExample {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.print("\rМигающий текст");
            Thread.sleep(500); // Пауза в миллисекундах
            System.out.print("\r              "); // Очистка текста
            Thread.sleep(500); // Пауза в миллисекундах
        }
        System.out.println("\rМигание завершено");
    }
}
