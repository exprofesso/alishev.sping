package alieshev.spring;

import alieshev.spring.course.Music;
import alieshev.spring.course.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

      //  Music music = classPathXmlApplicationContext.getBean("musicBean", Music.class);
        MusicPlayer musicPlayer = classPathXmlApplicationContext.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        classPathXmlApplicationContext.close();
    }
}
