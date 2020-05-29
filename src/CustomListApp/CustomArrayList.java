package CustomListApp;

public class CustomArrayList<T> implements CustomList<T> {

    private Object[] items = new Object[10];

    private  int currentIndex = -1;

    public  CustomArrayList(){

    }

    @Override
    public boolean add(T item) {


        currentIndex = currentIndex+1;

        //create a new array double the current size
        // repopulate the existing array and then add the new element in that

        if(currentIndex >= items.length-1){
            arrayResize();
        }
            items[currentIndex] = item;

        return true;
    }

    @Override
    public int getSize() {
        return currentIndex+1;
    }

    @Override
    public T get(int index) {
        if(index > currentIndex || index < 0){
            // throw a exception
           // java.lang.IndexOutOfBoundsException if the incoming index is greater than the current index of the array
            throw new IndexOutOfBoundsException();
        }
        else{
           return  (T)items[index];
        }

    }

    private void arrayResize(){
        Object[] tempArray = new Object[items.length * 2];

        for(int i = 0; i < items.length; i++){
            tempArray[i] = items[i];
        }
        items = tempArray;

    }

}
