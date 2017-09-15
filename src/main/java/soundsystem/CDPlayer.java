package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

@Component
//@Named
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    //생성자
    @Autowired(required = false)
//    @Inject
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }
    public void play() {
        cd.play();
    }

    //Property Setter
    @Autowired
    public void setCompactDisc(CompactDisc cd) {
        this.cd = cd;
    }

}
