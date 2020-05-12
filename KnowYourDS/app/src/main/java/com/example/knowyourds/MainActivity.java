package com.example.knowyourds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button array, stack, linkedlist, graph, tree, trie;
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = (WebView) findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        array = (Button) findViewById(R.id.Arrays);
        stack = (Button) findViewById(R.id.Stack);
        linkedlist = (Button) findViewById(R.id.LinkedList);
        graph = (Button) findViewById(R.id.graphs);
        tree = (Button) findViewById(R.id.Trees);
        trie = (Button) findViewById(R.id.Tries);
    }
    public void ds(View v){
        if (v.equals(array)){
            webView.loadUrl("https://www.geeksforgeeks.org/introduction-to-arrays/");
        }
        else if(v.equals(stack)){
            webView.loadUrl("https://www.geeksforgeeks.org/stack-data-structure/");
        }
        else if(v.equals(linkedlist)){
            webView.loadUrl("https://www.geeksforgeeks.org/data-structures/linked-list/");
        }
        else if(v.equals(graph)){
            webView.loadUrl("https://www.geeksforgeeks.org/graph-data-structure-and-algorithms/");
        }
        else if(v.equals(tree)){
            webView.loadUrl("https://www.tutorialspoint.com/data_structures_algorithms/tree_data_structure.htm");
        }
        else if(v.equals(trie)){
            webView.loadUrl("https://www.interviewcake.com/concept/java/trie");
        }

        }
    }

