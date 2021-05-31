import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyTest {

    // Unit testing for list size
    @Test
    public void getSizeOfList() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        assertEquals(4, list.size());
    }

    @Test
    public void getSizeOfListEmpty() {
        List<Integer> list = new ArrayList<>();

        assertEquals(0, list.size());
    }

    @Test(expected = NullPointerException.class)
    public void getSizeOfListNull() {
        List<Integer> list = null;

        list.size();
    }

    @Test
    public void getSizeOfListWhenRemovingElements() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        assertEquals(4, list.size());

        list.remove(1);

        assertEquals(3, list.size());
    }

    //Unit testing for clear list
    @Test
    public void clearEmptyList(){
        List<Integer> list = new ArrayList<>();

        list.clear();

        assertEquals(0, list.size());
    }

    @Test
    public void clearListWithItems(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.clear();

        assertEquals(0, list.size());
    }

    @Test(expected = NullPointerException.class)
    public void clearNullList(){
        List<Integer> list = null;

        list.clear();
    }

    //Unit testing for adding items
    @Test
    public void AddingItemsToEmptyList(){
        List<Integer> list = new ArrayList<>();
        list.add(1);

        assertEquals(1, list.size());
    }

    @Test
    public void AddingItemsToListWithItems(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(5);

        assertEquals(5, list.size());
    }

    @Test(expected = NullPointerException.class)
    public void AddingItemsToNullList(){
        List<Integer> list = null;

        list.contains(0);
    }

    //Unit testing check if item exist
    @Test
    public void CheckItemOnEmptyList(){
        List<Integer> list = new ArrayList<>();

        assertTrue(!list.contains(0));
    }

    @Test
    public void CheckItemOnListWithItems(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(5);

        assertTrue(list.contains(3));
    }

    @Test(expected = NullPointerException.class)
    public void CheckItemOnNullList(){
        List<Integer> list = null;

        list.contains(3);
    }

    //Unit testing get item by index
    @Test(expected = IndexOutOfBoundsException.class)
    public void GetItemOnEmptyList(){
        List<Integer> list = new ArrayList<>();

        list.get(0);
    }

    @Test
    public void GetItemOnListWithItems(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(5);

        assertEquals(3,(int) list.get(2));
    }

    @Test(expected = NullPointerException.class)
    public void GetItemOnNullList(){
        List<Integer> list = null;

        list.get(0);
    }

    //Unit testing search item index
    @Test
    public void SearchItemIndexOnEmptyList(){
        List<Integer> list = new ArrayList<>();

        assertEquals(-1,list.indexOf(0));
    }

    @Test
    public void SearchItemIndexOnListWithItems(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(5);

        assertEquals(2,(int) list.indexOf(3));
    }

    @Test(expected = NullPointerException.class)
    public void SearchItemIndexOnNullList(){
        List<Integer> list = null;

        list.indexOf(0);
    }

    //Unit testing deleting item by index
    @Test(expected = IndexOutOfBoundsException.class)
    public void DeleteItemByIndexOnEmptyList(){
        List<Integer> list = new ArrayList<>();

        list.remove(0);
    }

    @Test
    public void DeleteItemByIndexOnListWithItems(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(5);

        list.remove(0);

        assertEquals(2,(int) list.get(0));
    }

    @Test(expected = NullPointerException.class)
    public void DeleteItemByIndexOnNullList(){
        List<Integer> list = null;

        list.remove(0);
    }
}