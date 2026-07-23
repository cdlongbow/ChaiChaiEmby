package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes4.dex */
public final class l41 implements cd1, tm0 {
    public final Path a = new Path();
    public final Path b = new Path();
    public final Path c = new Path();
    public final ArrayList d = new ArrayList();
    public final k41 e;

    public l41(k41 k41Var) {
        this.e = k41Var;
    }

    public final void a(Path.Op op) {
        Path path = this.b;
        path.reset();
        Path path2 = this.a;
        path2.reset();
        ArrayList arrayList = this.d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            cd1 cd1Var = (cd1) arrayList.get(size);
            if (cd1Var instanceof pu) {
                pu puVar = (pu) cd1Var;
                ArrayList arrayList2 = (ArrayList) puVar.e();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path path3 = ((cd1) arrayList2.get(size2)).getPath();
                    Matrix matrixE = puVar.d;
                    pb2 pb2Var = puVar.l;
                    if (pb2Var != null) {
                        matrixE = pb2Var.e();
                    } else {
                        matrixE.reset();
                    }
                    path3.transform(matrixE);
                    path.addPath(path3);
                }
            } else {
                path.addPath(cd1Var.getPath());
            }
        }
        int i = 0;
        cd1 cd1Var2 = (cd1) arrayList.get(0);
        if (cd1Var2 instanceof pu) {
            pu puVar2 = (pu) cd1Var2;
            List listE = puVar2.e();
            while (true) {
                ArrayList arrayList3 = (ArrayList) listE;
                if (i >= arrayList3.size()) {
                    break;
                }
                Path path4 = ((cd1) arrayList3.get(i)).getPath();
                Matrix matrixE2 = puVar2.d;
                pb2 pb2Var2 = puVar2.l;
                if (pb2Var2 != null) {
                    matrixE2 = pb2Var2.e();
                } else {
                    matrixE2.reset();
                }
                path4.transform(matrixE2);
                path2.addPath(path4);
                i++;
            }
        } else {
            path2.set(cd1Var2.getPath());
        }
        this.c.op(path2, path, op);
    }

    @Override // defpackage.ou
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return;
            }
            ((cd1) arrayList.get(i)).b(list, list2);
            i++;
        }
    }

    @Override // defpackage.tm0
    public final void e(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            ou ouVar = (ou) listIterator.previous();
            if (ouVar instanceof cd1) {
                this.d.add((cd1) ouVar);
                listIterator.remove();
            }
        }
    }

    @Override // defpackage.cd1
    public final Path getPath() {
        Path path = this.c;
        path.reset();
        k41 k41Var = this.e;
        if (!k41Var.b) {
            int iD = w11.D(k41Var.a);
            if (iD == 0) {
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.d;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    path.addPath(((cd1) arrayList.get(i)).getPath());
                    i++;
                }
            } else {
                if (iD == 1) {
                    a(Path.Op.UNION);
                    return path;
                }
                if (iD == 2) {
                    a(Path.Op.REVERSE_DIFFERENCE);
                    return path;
                }
                if (iD == 3) {
                    a(Path.Op.INTERSECT);
                    return path;
                }
                if (iD == 4) {
                    a(Path.Op.XOR);
                    return path;
                }
            }
        }
        return path;
    }
}
