import java.io.*;
import java.util.*;

/**
 * ProfilePicture
 * Roy wants to change his profile picture on Facebook. Now Facebook has some restriction over the dimension of picture that we can upload.
 * Minimum dimension of the picture can be L x L, where L is the length of the side of square.
 * 
 * Now Roy has N photos of various dimensions.
 * Dimension of a photo is denoted as W x H
 * where W - width of the photo and H - Height of the photo
 * 
 * When any photo is uploaded following events may occur:
 * 
 * [1] If any of the width or height is less than L, user is prompted to upload another one. Print "UPLOAD ANOTHER" in this case.
 * [2] If width and height, both are large enough and
 * (a) if the photo is already square then it is accepted. Print "ACCEPTED" in this case.
 * (b) else user is prompted to crop it. Print "CROP IT" in this case.
 * 
 * (quotes are only for clarification)
 * 
 * Given L, N, W and H as input, print appropriate text as output. 
 */
 
public class Problem_1_ProfilePicture {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        int N = Integer.parseInt(br.readLine().trim());
        int[][] arr = new int[N][2];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Arrays.stream(br.readLine().trim().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }
        for(int i = 0; i < arr.length; i++) {
            if(arr[i][0] >= T && arr[i][1] >= T) {
                if ((arr[i][0] == T && arr[i][1] == T) || (arr[i][0] == arr[i][1] && arr[i][0] >= T))
                    System.out.println("ACCEPTED");
                else
                    System.out.println("CROP IT");
            }
            else
                System.out.println("UPLOAD ANOTHER");
        }
    }
}
