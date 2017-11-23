package br.ufpe.cin.generated;

import java.util.*;
import cide.gast.*;

import java.io.PrintStream;

import cide.languages.*;

import de.ovgu.cide.fstgen.ast.*;

public class SimplePrintVisitor extends AbstractFSTPrintVisitor  {
	public SimplePrintVisitor(PrintStream out) {
		super(out); generateSpaces=true;
	}
	public SimplePrintVisitor() {
		super(); generateSpaces=true;
	}
	public boolean visit(FSTNonTerminal nonTerminal) {
		if (nonTerminal.getType().equals("Document")) {
			printFeatures(nonTerminal,true);
			for (FSTNode v : getChildren(nonTerminal,"Element")) {
				v.accept(this);
			}
			printFeatures(nonTerminal,false);
			return false;
		}
		if (nonTerminal.getType().equals("Element1")) {
			printFeatures(nonTerminal,true);
			{
				FSTNode v=getChild(nonTerminal, "TagBlock");
				if (v!=null) {
					v.accept(this);
				}
			}
			printFeatures(nonTerminal,false);
			return false;
		}
		if (nonTerminal.getType().equals("Element2")) {
			printFeatures(nonTerminal,true);
			{
				FSTNode v=getChild(nonTerminal, "Comment");
				if (v!=null) {
					v.accept(this);
				}
			}
			printFeatures(nonTerminal,false);
			return false;
		}
		if (nonTerminal.getType().equals("Element3")) {
			printFeatures(nonTerminal,true);
			{
				FSTNode v=getChild(nonTerminal, "Cdata");
				if (v!=null) {
					v.accept(this);
				}
			}
			printFeatures(nonTerminal,false);
			return false;
		}
		if (nonTerminal.getType().equals("Element4")) {
			printFeatures(nonTerminal,true);
			{
				FSTNode v=getChild(nonTerminal, "Dtd");
				if (v!=null) {
					v.accept(this);
				}
			}
			printFeatures(nonTerminal,false);
			return false;
		}
		if (nonTerminal.getType().equals("Element5")) {
			printFeatures(nonTerminal,true);
			{
				FSTNode v=getChild(nonTerminal, "Xml");
				if (v!=null) {
					v.accept(this);
				}
			}
			printFeatures(nonTerminal,false);
			return false;
		}
		if (nonTerminal.getType().equals("Element6")) {
			printFeatures(nonTerminal,true);
			{
				FSTNode v=getChild(nonTerminal, "Sc_let1");
				if (v!=null) {
					v.accept(this);
				}
			}
			printFeatures(nonTerminal,false);
			return false;
		}
		if (nonTerminal.getType().equals("Element7")) {
			printFeatures(nonTerminal,true);
			{
				FSTNode v=getChild(nonTerminal, "Sc_let2");
				if (v!=null) {
					v.accept(this);
				}
			}
			printFeatures(nonTerminal,false);
			return false;
		}
		if (nonTerminal.getType().equals("Element8")) {
			printFeatures(nonTerminal,true);
			{
				FSTNode v=getChild(nonTerminal, "Script");
				if (v!=null) {
					v.accept(this);
				}
			}
			printFeatures(nonTerminal,false);
			return false;
		}
		if (nonTerminal.getType().equals("Element9")) {
			printFeatures(nonTerminal,true);
			{
				FSTNode v=getChild(nonTerminal, "Style");
				if (v!=null) {
					v.accept(this);
				}
			}
			printFeatures(nonTerminal,false);
			return false;
		}
		if (nonTerminal.getType().equals("Element10")) {
			printFeatures(nonTerminal,true);
			{
				FSTNode v=getChild(nonTerminal, "CharData");
				if (v!=null) {
					v.accept(this);
				}
			}
			printFeatures(nonTerminal,false);
			return false;
		}
		if (nonTerminal.getType().equals("TagBlock1")) {
			printFeatures(nonTerminal,true);
			for (FSTNode v : getChildren(nonTerminal,"Attribute")) {
				v.accept(this);
			}
			for (FSTNode v : getChildren(nonTerminal,"Element")) {
				v.accept(this);
			}
			printFeatures(nonTerminal,false);
			return false;
		}
		if (nonTerminal.getType().equals("TagBlock2")) {
			printFeatures(nonTerminal,true);
			for (FSTNode v : getChildren(nonTerminal,"Attribute")) {
				v.accept(this);
			}
			printFeatures(nonTerminal,false);
			return false;
		}
		if (nonTerminal.getType().equals("TagBlock3")) {
			printFeatures(nonTerminal,true);
			for (FSTNode v : getChildren(nonTerminal,"Attribute")) {
				v.accept(this);
			}
			printFeatures(nonTerminal,false);
			return false;
		}
		if (nonTerminal.getType().equals("TagBlock4")) {
			printFeatures(nonTerminal,true);
			for (FSTNode v : getChildren(nonTerminal,"Attribute")) {
				v.accept(this);
			}
			printFeatures(nonTerminal,false);
			return false;
		}
		if (nonTerminal.getType().equals("Comment")) {
			printFeatures(nonTerminal,true);
			printFeatures(nonTerminal,false);
			return false;
		}
		throw new RuntimeException("Unknown Non Terminal in FST "+nonTerminal);
	}
	protected boolean isSubtype(String type, String expectedType) {
		if (type.equals(expectedType)) return true;
		if (type.equals("Element2") && expectedType.equals("Element")) return true;
		if (type.equals("Sc_let1") && expectedType.equals("Sc_let")) return true;
		if (type.equals("Element1") && expectedType.equals("Element")) return true;
		if (type.equals("Sc_let2") && expectedType.equals("Sc_let")) return true;
		if (type.equals("Element4") && expectedType.equals("Element")) return true;
		if (type.equals("Attribute1") && expectedType.equals("Attribute")) return true;
		if (type.equals("Element3") && expectedType.equals("Element")) return true;
		if (type.equals("Attribute2") && expectedType.equals("Attribute")) return true;
		if (type.equals("Element9") && expectedType.equals("Element")) return true;
		if (type.equals("Element6") && expectedType.equals("Element")) return true;
		if (type.equals("Element10") && expectedType.equals("Element")) return true;
		if (type.equals("Element5") && expectedType.equals("Element")) return true;
		if (type.equals("Text2") && expectedType.equals("Text")) return true;
		if (type.equals("Element8") && expectedType.equals("Element")) return true;
		if (type.equals("Element7") && expectedType.equals("Element")) return true;
		if (type.equals("TagBlock4") && expectedType.equals("TagBlock")) return true;
		if (type.equals("Text1") && expectedType.equals("Text")) return true;
		if (type.equals("TagBlock2") && expectedType.equals("TagBlock")) return true;
		if (type.equals("TagBlock3") && expectedType.equals("TagBlock")) return true;
		if (type.equals("TagBlock1") && expectedType.equals("TagBlock")) return true;
		return false;
	}
}
