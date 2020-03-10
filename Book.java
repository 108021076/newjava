/**
 * book
 */
public class Book {
    private String cover, content, press, title, author;
    
    public Book(){
        System.out.println("book created!");
    }
    //function member
    public void setCover(String newCover){
        this.cover = newCover;
    }
    public String getCover(){
        return this.cover;
    }
    public void setTitle(String newTitle){
        this.title = newTitle;
    }
    public String getTitle(){
        return this.title;
    }
    public void setContent(String newContent){
        this.content = newContent;
    }
    public String getContent(){
        return this.content;
    }
    public void setPress(String newPress){
        this.press = newPress;
    }
    public String getPress(){
        return this.press;
    }
    public void showinfo(String showinfo){
        this.author = showinfo;
    }
    public String getAuthor(){
        return this.author;
    }
}