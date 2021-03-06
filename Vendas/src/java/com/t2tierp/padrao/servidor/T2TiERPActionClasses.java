package com.t2tierp.padrao.servidor;

import com.t2tierp.vendas.servidor.ImportaVendaOrcamentoAction;
import com.t2tierp.vendas.servidor.TipoNotaFiscalDetalheAction;
import com.t2tierp.vendas.servidor.TipoNotaFiscalGridAction;
import com.t2tierp.vendas.servidor.ValidaVendaOrcamentoAction;
import com.t2tierp.vendas.servidor.VendaCondicoesPagamentoDetalheAction;
import com.t2tierp.vendas.servidor.VendaCondicoesPagamentoGridAction;
import com.t2tierp.vendas.servidor.VendaCondicoesParcelasGridAction;
import com.t2tierp.vendas.servidor.VendaDetalheAction;
import com.t2tierp.vendas.servidor.VendaDetalheGridAction;
import com.t2tierp.vendas.servidor.VendaFreteDetalheAction;
import com.t2tierp.vendas.servidor.VendaFreteGridAction;
import com.t2tierp.vendas.servidor.VendaGridAction;
import com.t2tierp.vendas.servidor.VendaOrcamentoDetalheAction;
import com.t2tierp.vendas.servidor.VendaOrcamentoDetalheGridAction;
import com.t2tierp.vendas.servidor.VendaOrcamentoGridAction;
import com.t2tierp.vendas.servidor.VendaRomaneioEntregaDetalheAction;
import com.t2tierp.vendas.servidor.VendaRomaneioEntregaDetalheGridAction;
import com.t2tierp.vendas.servidor.VendaRomaneioEntregaGridAction;
import org.openswing.swing.server.ActionsCollection;
import org.openswing.swing.server.Action;

/**
 * <p>Title: T2Ti ERP</p>
 * <p>Description: Mapeia todas as ações tomadas no lado do servidor.</p>
 *
 * <p>The MIT License</p>
 *
 * <p>Copyright: Copyright (C) 2010 T2Ti.COM</p>
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
 *       The author may be contacted at:
 *           t2ti.com@gmail.com</p>
 *
 * @author Claudio de Barros (T2Ti.COM)
 * @version 1.0
 */
public class T2TiERPActionClasses extends ActionsCollection {

    public T2TiERPActionClasses() {
        Action a = null;

        //infra
        a = new T2TiERPButtonAuthorizationsAction(); put(a.getRequestName(), a);
        a = new T2TiERPFunctionAuthorizationsAction(); put(a.getRequestName(), a);
        a = new UserLoginAction(); put(a.getRequestName(), a);
        a = new T2TiERPContainerAction(); put(a.getRequestName(), a);

        /*actions do módulo */
        a = new TipoNotaFiscalGridAction(); put(a.getRequestName(), a);
        a = new TipoNotaFiscalDetalheAction(); put(a.getRequestName(), a);
        a = new VendaCondicoesPagamentoGridAction(); put(a.getRequestName(), a);
        a = new VendaCondicoesPagamentoDetalheAction(); put(a.getRequestName(), a);
        a = new VendaCondicoesParcelasGridAction(); put(a.getRequestName(), a);
        a = new VendaOrcamentoGridAction(); put(a.getRequestName(), a);
        a = new VendaOrcamentoDetalheAction(); put(a.getRequestName(), a);
        a = new VendaOrcamentoDetalheGridAction(); put(a.getRequestName(), a);
        a = new VendaGridAction(); put(a.getRequestName(), a);
        a = new VendaDetalheAction(); put(a.getRequestName(), a);
        a = new VendaDetalheGridAction(); put(a.getRequestName(), a);
        a = new VendaFreteGridAction(); put(a.getRequestName(), a);
        a = new VendaFreteDetalheAction(); put(a.getRequestName(), a);
        a = new VendaRomaneioEntregaGridAction(); put(a.getRequestName(), a);
        a = new VendaRomaneioEntregaDetalheAction(); put(a.getRequestName(), a);
        a = new VendaRomaneioEntregaDetalheGridAction(); put(a.getRequestName(), a);

        /*validacoes e importacoes*/
        a = new ImportaDadosAction(); put(a.getRequestName(), a);
        a = new ValidaDadosAction(); put(a.getRequestName(), a);
        a = new ImportaVendaOrcamentoAction(); put(a.getRequestName(), a);
        a = new ValidaVendaOrcamentoAction(); put(a.getRequestName(), a);
    }
}
