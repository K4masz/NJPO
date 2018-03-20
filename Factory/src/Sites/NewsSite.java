package Sites;

import java.util.Random;

/**
 * Created by K4masz on 2017-11-15.
 */
public class NewsSite extends Site {


    public NewsSite() {
        super();
    }

    @Override
    void writeContent(){
        int max = new Random().nextInt(5);
        for(int i = 1; i < max; i++) {
            generateArticle();
        }
        this.pageContent = this.contentBuilder.toString();
    }

    void generateArticle(){
        contentBuilder.append("<h1>Title</h1>");
        contentBuilder.append("Lorem ipsum dolor sit amet dui. Nullam a lorem semper eros. Aliquam eget dui pulvinar lacinia, magna ac lacus. Nullam justo. Nulla facilisi. Morbi pede. Fusce blandit risus et magnis dis parturient montes, nascetur ridiculus mus. Mauris vel turpis mauris orci, blandit id, mattis eget, dignissim dolor in nonummy faucibus orci blandit velit adipiscing elit. Aliquam commodo est dolor, dictum vel, sapien. Praesent magna non dolor. Suspendisse turpis ut tellus tortor, fermentum sed, neque. Etiam vestibulum dictum wisi sapien libero, egestas velit. Donec porta, erat in augue. Praesent lacinia id, elementum fringilla mi, viverra sed, posuere ante pulvinar scelerisque. Nam interdum eu, aliquam eget, bibendum dui. Maecenas blandit vel, wisi. Nulla facilisi. Nullam aliquet in, ornare eleifend ut, accumsan quam, lobortis eu, bibendum vel, eleifend non, placerat quam. Nulla euismod, volutpat ligula libero, posuere egestas quis, venenatis arcu. Morbi sollicitudin. Nulla gravida mattis, magna ac turpis egestas. Phasellus dapibus eu, ornare dolor sit amet, consectetuer adipiscing elit. Vestibulum massa augue, ullamcorper ut, accumsan sit amet augue a augue sit amet mi id diam. Aenean lacus sit amet purus sit amet.");
        contentBuilder.append("<br><br><br><br>");
    }
}
