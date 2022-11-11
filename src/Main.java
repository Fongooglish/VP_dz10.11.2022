import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class Main implements Shell {
    public static void main(String[] args) throws FileNotFoundException {
        int[] arr = new int[10];
        int[] tempArr = arr;
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * arr.length);
        }
        System.out.println(Arrays.toString(arr));

        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("src\\ShellSort.txt", "rw");
            String write = Arrays.toString(arr);
            randomAccessFile.writeBytes("Start array: " + write);
            randomAccessFile.writeBytes("\r\n");
            int h = arr.length/2;
            while (h >= 1) {
                Shell.sort(arr, h);
                h = h/2;

        }
            write = Arrays.toString(arr);
            randomAccessFile.writeBytes("Sorted array: " + write);
            randomAccessFile.writeBytes("\r\n");
                randomAccessFile.close();
        } catch (FileNotFoundException exception) {
            exception.getMessage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Arrays.toString(arr));
    }
}