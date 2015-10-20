package Closures.IndexBasedCurry

/**
 * Created by chetan on 19/10/15.
 */
def volume = { double l, double w, double h -> l*w*h }
//the volume function defines 3 parameters
def fixedWidthVolume = volume.ncurry(1, 2d)
//	ncurry will set the second parameter (index = 1) to 2d,
// creating a new volume function which accepts length and height
println volume(3d, 2d, 4d) == fixedWidthVolume(3d, 4d)
//that function is equivalent to calling volume omitting the width
def fixedWidthAndHeight = volume.ncurry(1, 2d, 4d)
//it is also possible to set multiple parameters,starting from the specified index

println volume(3d, 2d, 4d) == fixedWidthAndHeight(3d)
//the resulting function accepts as many parameters as the initial one
// minus the number of parameters set by ncurry
