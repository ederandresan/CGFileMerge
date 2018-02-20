package de.tiramon.cg.filemerge;

public class JavaProject implements CodeProject {

	@Override
	public String getFileExtension() {
		return ".java";
	}

	@Override
	public boolean isImportLine(String line) {
		return line.startsWith("import ");
	}

	@Override
	public String readImportFromLine(String line) {
		return line;
	}
}
