package recursionanddynamicprogramming;
/* problem 7 : give a screen, a point,and a new color, fill the surrounding area until from the 
 * original color
 */
class pro7 {
enum Color{
	black,white,red,yellow,green
}
boolean paintFill(Color[][] screen, int x, int y, Color oldcolor,Color newcolor){
	if(x<0||x>=screen[0].length||y<0||y>=screen.length){
		return false;
	}
	// x is horizontal axis and y is vertical
	if(screen[y][x]==oldcolor){
		screen[y][x]=newcolor;
		paintFill(screen,x-1,y,oldcolor,newcolor);
		paintFill(screen,x+1,y,oldcolor,newcolor);
		paintFill(screen,x,y-1,oldcolor,newcolor);
		paintFill(screen,x,y+1,oldcolor,newcolor);
	}
	return true;
}
}
