package polymorphism;

import org.springframework.stereotype.Component;

public class AppleSpeaker implements Speaker {

//    @Component
    public AppleSpeaker(){
        System.out.println("===> Apple Speaker 객체 생성");
    }

    @Override
    public void volumeUp() {
        System.out.println("AppleSpeaker ---- 소리 올린다.");

    }

    @Override
    public void volumeDown() {
        System.out.println("AppleSpeaker --- 소리 내린다.");
    }
}
