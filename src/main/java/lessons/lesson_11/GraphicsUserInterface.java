package lessons.lesson_11;

import materials.lesson_11.graphic_mp3_player.Mp3Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GraphicsUserInterface extends JFrame { // Наследуем класс от JFrame для создания оконного приложения
    private Mp3Player mp3Player; // Объявляем переменную для работы с mp3 плеером

    public GraphicsUserInterface() { // Конструктор класса
        super("Mp3 Graphics Music Player"); // Вызываем конструктор базового класса JFrame, устанавливая заголовок окна
        mp3Player = new Mp3Player("src/main/resources/Dj Power - Popcorn.mp3");
        initializeUI();
    }

    private void initializeUI() {
        setSize(400, 100);
        setLocationRelativeTo(null); // установка онка плеера в центре экрана
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton playButton = new JButton("PLAY");
        JButton stopButton = new JButton("STOP");

        playButton.addMouseListener( // Добавляем слушателя событий мыши к кнопке "Play"
                new MouseAdapter() { // implements MouseListener
                    public void mouseEntered(MouseEvent event) { // Метод вызывается при наведении курсора на кнопку
                        playButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Меняем курсор на руку
                    }
                }
        );

        stopButton.addMouseListener( // Добавляем слушателя событий мыши к кнопке "Stop"
                new MouseAdapter() { // implements MouseListener
                    public void mouseEntered(MouseEvent event) { // Метод вызывается при наведении курсора на кнопку
                        stopButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Меняем курсор на руку
                    }
                }
        );

        playButton.addActionListener(e -> mp3Player.play()); // Добавляем слушателя нажатий на кнопку "Play"
        stopButton.addActionListener(e -> mp3Player.stop()); // Добавляем слушателя нажатий на кнопку "Stop"

        JPanel jPanel = new JPanel();
        jPanel.add(playButton);
        jPanel.add(stopButton);

        add(jPanel);
        setResizable(false);
        setVisible(true);
    }
}
