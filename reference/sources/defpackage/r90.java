package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-702bd64179e3c631cccc617c02a483b7a4664c3f322618b30c240a9227c1564b */
/* JADX INFO: loaded from: classes.dex */
public final class r90 extends RuntimeException {
    public final py h;

    public r90(py pyVar) {
        this.h = pyVar;
        if (pyVar.b) {
            return;
        }
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, 200};
        List list = pyVar.a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            ry ryVar = (ry) list.get(i);
            if (!gi.M(iArr, ryVar.a)) {
                if (ryVar.a == 100) {
                    int i3 = i + 2;
                    if (i3 < size && ((ry) list.get(i3)).a == 1000) {
                        break;
                    } else {
                        iv.t0(arrayList);
                    }
                } else {
                    arrayList.add(ryVar);
                }
            }
            i = i2;
        }
        int size2 = arrayList.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            stackTraceElementArr[i4] = new StackTraceElement("$$compose", jp1.h(((ry) arrayList.get(i4)).a, "m$"), "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        py pyVar = this.h;
        if (!pyVar.b) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        na1 na1VarQ = lt.q();
        List list = pyVar.a;
        list.getClass();
        l92 l92Var = new l92(list);
        int iA = l92Var.a();
        for (int i = 0; i < iA; i++) {
            ((ry) l92Var.get(i)).getClass();
        }
        na1 na1VarE = lt.e(na1VarQ);
        na1VarE.getClass();
        l92 l92Var2 = new l92(na1VarE);
        int iA2 = l92Var2.a();
        for (int i2 = 0; i2 < iA2; i2++) {
            String str = (String) l92Var2.get(i2);
            sb.append("\tat ");
            sb.append(str);
            sb.append('\n');
        }
        return sb.toString();
    }
}
