package com.t2tierp.ponto.cliente;

import com.t2tierp.ponto.java.PontoMarcacaoVO;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.receive.java.VOListResponse;
import org.openswing.swing.table.client.GridController;
import org.openswing.swing.table.java.GridDataLocator;

/**
* <p>Title: T2Ti ERP</p>
* <p>Description: Classe de controle da grid PontoIncluiMarcacaoGrid.</p>
*
* <p>The MIT License</p>
*
* <p>Copyright: Copyright (C) 2010 T2Ti.COM
*
* Permission is hereby granted, free of charge, to any person
* obtaining a copy of this software and associated documentation
* files (the "Software"), to deal in the Software without
* restriction, including without limitation the rights to use,
* copy, modify, merge, publish, distribute, sublicense, and/or sell
* copies of the Software, and to permit persons to whom the
* Software is furnished to do so, subject to the following
* conditions:
*
* The above copyright notice and this permission notice shall be
* included in all copies or substantial portions of the Software.
*
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
* EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
* OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
* NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
* HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
* WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
* FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
* OTHER DEALINGS IN THE SOFTWARE.
*
*        The author may be contacted at:
*            t2ti.com@gmail.com</p>
*
* @author Claudio de Barros (t2ti.com@gmail.com)
* @version 1.0
*/
public class PontoIncluiMarcacaoGridController extends GridController implements GridDataLocator {

    private List<PontoMarcacaoVO> listaMarcacoes;

    public PontoIncluiMarcacaoGridController() {
        listaMarcacoes = new ArrayList<PontoMarcacaoVO>();
    }

    public Response loadData(int action, int startIndex, Map filteredColumns, ArrayList currentSortedColumns, ArrayList currentSortedVersusColumns, Class valueObjectType, Map otherGridParams) {
        return new VOListResponse(listaMarcacoes, false, listaMarcacoes.size());
    }

    @Override
    public Response insertRecords(int[] rowNumbers, ArrayList newValueObjects) throws Exception {
        PontoMarcacaoVO marcacao;
        for (int i = 0; i < newValueObjects.size(); i++){
            marcacao = (PontoMarcacaoVO) newValueObjects.get(i);
            marcacao.setTipoRegistro("I");
            listaMarcacoes.add(marcacao);
        }
        return new VOListResponse(newValueObjects, false, newValueObjects.size());
    }

    @Override
    public Response updateRecords(int[] rowNumbers, ArrayList oldPersistentObjects, ArrayList persistentObjects) throws Exception {
        listaMarcacoes.set(rowNumbers[0], (PontoMarcacaoVO) persistentObjects.get(0));
        return new VOListResponse(persistentObjects, false, persistentObjects.size());
    }

    @Override
    public Response deleteRecords(ArrayList persistentObjects) throws Exception {
        return new VOListResponse(persistentObjects, false, persistentObjects.size());
    }
}