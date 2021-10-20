package java8.designpattern.builder;

/**
 *
 */
public class TextBuilder extends Builder{

    private StringBuffer buffer = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        buffer.append("===========\n");
        buffer.append("ㅂ"+title+"ㄴ");
        buffer.append("\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append("◆"+str+"\n");
        buffer.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for(int i = 0; i< items.length; i++){
            buffer.append("º"+items[i]+"\n");
            buffer.append("\n");
        }
    }

    @Override
    public void close() {
        buffer.append("=======================\n");
    }

    public String getResult(){
        return buffer.toString();
    }
}
