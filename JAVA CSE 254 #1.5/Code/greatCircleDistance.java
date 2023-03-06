import java.util.Scanner;

public class greatCircleDistance {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the coordinates of point 1
        System.out.print("Enter the latitude and longitude of point 1 in degrees: ");
        double lat1 = scanner.nextDouble();
        double lon1 = scanner.nextDouble();

        // Prompt the user to enter the coordinates of point 2
        System.out.print("Enter the latitude and longitude of point 2 in degrees: ");
        double lat2 = scanner.nextDouble();
        double lon2 = scanner.nextDouble();

        // Convert the coordinates from degrees to radians
        double lat1Rad = Math.toRadians(lat1);
        double lon1Rad = Math.toRadians(lon1);
        double lat2Rad = Math.toRadians(lat2);
        double lon2Rad = Math.toRadians(lon2);

        // Calculate the great circle distance using the haversine formula
        double dlon = lon2Rad - lon1Rad;
        double dlat = lat2Rad - lat1Rad;
        double a = Math.pow(Math.sin(dlat/2), 2) + Math.cos(lat1Rad) * Math.cos(lat2Rad) * Math.pow(Math.sin(dlon/2), 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        double radius = 6371; // Earth's radius in kilometers
        double distance = radius * c;

        // Display the distance between the points
        System.out.printf("The distance between point 1 and point 2 is %.2f km", distance);
    }
}