import com.example.exception.NoSquareException;
import com.example.model.Matrix;
import com.example.service.MatrixMathematics;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class MatrixSteps {
    
    Matrix inverseMatrix ;
    Matrix cofactorMatrix ;
    Matrix mat;
	
	// Cofactor

    @When("I compute cofactor of")
    public void iComputeCofactorOf(DataTable table) throws NoSquareException {
        double [][] data = new double[2][2];
        List<Map<String, Double>> rows = table.asMaps(String.class, Double.class);
        int i =0;
        for (Map<String, Double> columns : rows){
            int j =0;
            data[i][j]= columns.get("col1");
            data[i][j+1] = columns.get("col2");
            i=i+1;
        }
        mat.setData(data);
        cofactorMatrix = MatrixMathematics.cofactor(mat);
    }

    @Then("The result of cofactor is")
    public void iFindAsCofactoreResult(DataTable table) {
        double [][] data = new double[2][2];
        List<Map<String, Double>> rows = table.asMaps(String.class, Double.class);
        int i =0;
        for (Map<String, Double> columns : rows){
            int j =0;
            data[i][j]= columns.get("col1");
            data[i][j+1] = columns.get("col2");
            i=i+1;
        }
        Matrix result = new Matrix() ;
        result.setData(data);
        assertEquals(result,cofactorMatrix);


    }

    @Given("I have A Matrix")
    public void iHaveAMatrix() {
         mat=new Matrix();
    }

    @When("I compute inverse of")
    public void iComputeInverseOf(DataTable table) throws NoSquareException {
        double [][] data = new double[2][2];
        List<Map<String, Double>> rows = table.asMaps(String.class, Double.class);
        int i =0;
        for (Map<String, Double> columns : rows){
            int j =0;
            data[i][j]= columns.get("col1");
            data[i][j+1] = columns.get("col2");
            i=i+1;
        }
        mat.setData(data);
        inverseMatrix = MatrixMathematics.inverse(mat);
    }

    @Then("The result of inverse is")
    public void iFindAsInverseResult(DataTable table) {
        double [][] data = new double[2][2];
        List<Map<String, Double>> rows = table.asMaps(String.class, Double.class);
        int i =0;
        for (Map<String, Double> columns : rows){
            int j =0;
            data[i][j]= columns.get("col1");
            data[i][j+1] = columns.get("col2");
            i=i+1;
        }
        Matrix result = new Matrix() ;
        result.setData(data);
        assertEquals(result,inverseMatrix);


    }


    
}

