package JavaAssist

import aj.org.objectweb.asm.ClassVisitor
import groovyjarjarasm.asm.commons.AnalyzerAdapter
import javassist.bytecode.ClassFile
import javassist.bytecode.ClassFilePrinter
import javassist.bytecode.analysis.FramePrinter
import org.codehaus.groovy.runtime.StackTraceUtils
import org.codehaus.groovy.runtime.callsite.AbstractCallSite
import org.codehaus.groovy.runtime.callsite.CallSite
import org.codehaus.groovy.runtime.callsite.CallSiteGenerator
import org.h2.command.ddl.Analyze
import javassist.tools.Dump
/**
 * Created by chetan on 22/11/16.
 */

/*
//Dump is a tool for viewing the class definition in the given class file. Unlike the JDK javap tool,
// Dump works even if the class file is broken.
//prints the contents of the constant pool and the list of methods and fields
 */

            DataInputStream intre = new DataInputStream(new FileInputStream("/home/chetan/IdeaProjects/MyGroovy/out/production/MyGroovy/JavaAssist/dump.class"));
            ClassFile w = new ClassFile(intre);
            PrintWriter out = new PrintWriter(System.out, true);
            out.println("*** constant pool ***");
            w.getConstPool().print(out);
            out.println();
            out.println("*** members ***");
            ClassFilePrinter.print(w,out)

