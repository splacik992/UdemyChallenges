package TimBuchalka.section6;

public class Point {

        private int x;
        private int y;

        public Point(){

        }

        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }

        public int getX(){
            return this.x;
        }
        public int getY(){
            return this.y;
        }
        public void setX(int x){
            this.x = x;
        }
        public void setY(int y){
            this.y = y;
        }

        public double distance(){
            double result;
            result = Math.sqrt( (getX() - 0)*(getX() - 0)+(getY() - 0)*(getY() - 0) );
            return result;
        }
        public double distance(int x, int y){
            double result;
            result = Math.sqrt( (getX() - x)*(getX() - x)+(getY() - y)*(getY() - y) );
            return result;
        }
        public double distance(Point point){
            int newX = point.getX();
            int newY = point.getY();

            double result;
            result = Math.sqrt( (getX() - newX)*(getX() - newX)+(getY() - newY)*(getY() - newY) );
            return result;
        }
    }