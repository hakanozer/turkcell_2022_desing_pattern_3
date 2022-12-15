package _8_visitor;

public class ActionVisitor {

    public void visit( IExportVisitor iExportVisitor, Object obj ) {
        iExportVisitor.accept(obj);
    }

}
