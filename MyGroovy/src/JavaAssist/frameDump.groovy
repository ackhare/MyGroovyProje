package JavaAssist

import javassist.ClassPool
import javassist.CtClass
import javassist.bytecode.ClassFile
import javassist.bytecode.analysis.FramePrinter

/**
 * Created by chetan on 22/11/16.
 */

/*
framedump is a tool for viewing a merged combination of the instructions
and frame state of all methods in a class
 */

ClassPool pool=ClassPool.getDefault();
InputStream ins = new FileInputStream('/home/chetan/IdeaProjects/MyGroovy/out/production/MyGroovy/JavaAssist/frameDump.class')
CtClass cc = pool.makeClass(ins);

//CtClass clazz=pool.get(Person.class.toString());
//System.out.println("Frame Dump of "+clazz.getName()+":");
FramePrinter.print(cc, System.out);